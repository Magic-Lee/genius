package cn.genius.study.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"mybatis/mybatis-generator.properties"})
public class GeneratorBean {

    private static String author;
    private static String parentPackageName;
    private static String supperController;
    private static String supperEntity;
    private static Boolean enableLombok;


    public static String getAuthor() {
        return author;
    }

    public static String getParentPackageName() {
        return parentPackageName;
    }

    public static String getSupperController() {
        return supperController;
    }

    public static String getSupperEntity() {
        return supperEntity;
    }

    public static Boolean getEnableLombok() {
        return enableLombok;
    }

    @Value("${mybatis.generator.author}")
    public void setAuthor(String author) {
        GeneratorBean.author = author;
    }
    @Value("${mybatis.generator.parentPackageName}")
    public void setParentPackageName(String parentPackageName) {
        GeneratorBean.parentPackageName = parentPackageName;
    }
    @Value("${mybatis.generator.supperController}")
    public void setSupperController(String supperController) {
        GeneratorBean.supperController = supperController;
    }
    @Value("${mybatis.generator.supperEntity}")
    public void setSupperEntity(String supperEntity) {
        GeneratorBean.supperEntity = supperEntity;
    }
    @Value("${mybatis.generator.enableLombok}")
    public void setEnableLombok(String enableLombok) {GeneratorBean.enableLombok = Boolean.parseBoolean(enableLombok) ; }
}
