package com.chilx.value;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/**
 * @author chilx
 * @date 2021/4/7
 **/
@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "chilx.girlfriend")
public class User {

    private String name;

    private Integer age;
    /**
     * 默认值为空串
     */
    private String gender;

    /**
     * 不存在为null
     */
    private String nikeName;
    /**
     * 默认值为 男
     */
    private String password;

    private String[] hobbies;

    private List<String> friend;

    private List<String> pet1;

    private List<String> pet2;

    private List<String> pet3;

    private Map<String, Integer> courses;

    private Boyfriend boyfriend;

}
@Getter
@Setter
@ToString
class Boyfriend{
    private String name;

    private Integer age;
}
