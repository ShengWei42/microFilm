package com.typeofNull.nullvideo.service;

import com.typeofNull.nullvideo.model.vo.search.SearchVideoVO;

import java.util.List;

/**
 * @author Shengwei
 * @data 2023/11/2
 * @Description
 */
public interface SearchService {

    List<SearchVideoVO> searchSpecialVideo(Long videoTypeId);

    Object searchAll(String searchText,Integer option);

}
