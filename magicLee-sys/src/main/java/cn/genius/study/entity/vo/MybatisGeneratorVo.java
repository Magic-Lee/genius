package cn.genius.study.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class MybatisGeneratorVo implements Serializable {
    private String moduleName;
    private String projectName;
    private String[] tableNames;
}
