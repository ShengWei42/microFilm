package com.typeofNull.nullvideo.model.vo.video;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Shengwei
 * @data 2023/10/30
 * @Description 用于个人主页展示
 */
@Data
public class VideoShowVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String videoId;

    /**
     * 封面url
     */
    private String videoCoverUrl;

    /**
     * 视频url
     */
    private String videoUrl;

    /**
     * 视频播放数
     */
    private String videoPlayNum;

    /**
     * 视频描述
     */
    private String videoDescription;


}
