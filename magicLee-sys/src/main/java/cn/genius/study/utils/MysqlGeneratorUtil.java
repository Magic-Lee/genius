package cn.genius.study.utils;

import cn.genius.study.entity.DatasourceBean;
import cn.genius.study.entity.GeneratorBean;
import cn.genius.study.entity.vo.MybatisGeneratorVo;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;
import java.io.IOException;

public class MysqlGeneratorUtil {

    public static void mybatisGenerator(MybatisGeneratorVo vo) throws Exception{
        File projectFile = new File(System.getProperty("user.dir") + File.separator + vo.getProjectName());
        if(!projectFile.exists()){throw new IOException("该子项目不存在");}

        AutoGenerator mpg = new AutoGenerator();
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectFile.getAbsolutePath() + "/src/main/java");
        gc.setServiceName("%sService");// 设置Service接口生成名称,这样生成接口前面就不会有 I
        gc.setIdType(IdType.AUTO);//设置id的生成策略默认算法
        gc.setDateType(DateType.ONLY_DATE);//设置日期生成策略
        gc.setOpen(false);//生成代码后是否打开文件夹
        gc.setFileOverride(true);//是否覆盖原来的文件
        gc.setSwagger2(false);//swagger
        gc.setAuthor(GeneratorBean.getAuthor());// 作者
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
        if(StringUtils.isEmpty(vo.getModuleName())){pc.setModuleName(""); }
        else{pc.setModuleName(vo.getModuleName());}
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
        strategy.setRestControllerStyle(true);
        mpg.setStrategy(strategy);
        mpg.execute();

    }
}
