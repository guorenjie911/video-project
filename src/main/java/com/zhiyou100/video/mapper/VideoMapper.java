package com.zhiyou100.video.mapper;

import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.model.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    
    
    
    
	int findCount(@Param("queryName") String queryName, @Param("speakerId") Integer speakerId, @Param("courseId") Integer courseId);

	List<Video> findVideo(@Param("queryName") String queryName, @Param("speakerId") Integer speakerId, @Param("courseId") Integer courseId, @Param("beginIndex") Integer beginIndex);
	
	Video findeVideoWithCouserWithSpeakerByVideoId(Integer videoId);


}