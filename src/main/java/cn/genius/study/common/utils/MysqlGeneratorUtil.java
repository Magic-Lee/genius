package cn.genius.study.common.utils;

import cn.genius.study.common.model.DatasourceBean;
import cn.genius.study.common.model.GeneratorBean;
import cn.genius.study.common.model.vo.MybatisGeneratorVo;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MysqlGeneratorUtil {
    public static final String GENERATOR_AUTHOR = "magicLee";
    public static final String GENERATOR_PARENT_PACKAGE_NAME = "cn.genius.study";
    public static final String GENERATOR_SUPER_CONTROLLER = "cn.genius.study.common.web.BaseController";
    public static final String GENERATOR_SUPER_ENTITY = "cn.genius.study.common.model.BaseEntity";
    public static final Boolean GENERATOR_ENABLE_LOMBOK = true;

    public static void mybatisGenerator(MybatisGeneratorVo vo) throws Exception{
        AutoGenerator mpg = new AutoGenerator();
        String author = GeneratorBean.getAuthor();
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(GeneratorBean.getAuthor());   // 作者
        gc.setOpen(false);      //生成代码后是否打开文件夹
        gc.setServiceName("%sService");  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        mpg.setGlobalConfig(gc);

        // 数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(DatasourceBean.getUrl());
        dsc.setDriverName(DatasourceBean.getDriverClassName());
        dsc.setUsername(DatasourceBean.getUsername());
        dsc.setPassword(DatasourceBean.getPassword());
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(vo.getModuleName()); // 模块名称, 这里可以根据不同模块来写
        pc.setParent(GeneratorBean.getParentPackageName()); // 父包名
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperControllerClass(GeneratorBean.getSupperController());
        strategy.setSuperEntityClass(GeneratorBean.getSupperEntity());
        strategy.setEntityLombokModel(GeneratorBean.getEnableLombok());
        strategy.setInclude(vo.getTableNames());  // 如果要生成多个,这里可以传入String[]
        mpg.setStrategy(strategy);
        mpg.execute();

    }
}
