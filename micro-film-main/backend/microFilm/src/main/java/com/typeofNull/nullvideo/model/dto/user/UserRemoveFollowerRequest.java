package com.typeofNull.nullvideo.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Shengwei
 * @data 2023/10/28
 * @Description
 */
@Data
public class UserRemoveFollowerRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId;

    private String followerId;

}
