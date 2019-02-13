package com.leyou.myexception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: 98050
 * @Time: 2018-11-05 16:09
 * @Feature:
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum LyException {
    /**
     * 分类信息无法找到
     */
    CATEGORY_NOT_FOUND(400,"分类信息无法找到"),

    /**
     * 品牌信息无法找到
     */
    BRAND_NOT_FOUND(400,"品牌信息无法找到"),
    ;

    private Integer code;
    private String msg;

}
