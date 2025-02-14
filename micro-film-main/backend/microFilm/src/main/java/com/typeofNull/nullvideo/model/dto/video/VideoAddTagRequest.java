package com.typeofNull.nullvideo.model.dto.video;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Shengwei
 * @data 2023/10/31
 * @Description
 */
@Data
public class VideoAddTagRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String videoTagName;
}
