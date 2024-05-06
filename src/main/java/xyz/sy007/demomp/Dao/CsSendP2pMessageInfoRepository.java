package xyz.sy007.demomp.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import xyz.sy007.demomp.bean.CsSendP2pMessageInfoPo;

import java.util.Map;

/**
 * @description: 私聊消息 DAO
 * @author: wangning
 * @create: 2023/12/14 11:27
 **/

//@Mapper
//@MappedJdbcTypes(JdbcType.VARCHAR)
//@MappedTypes(Map.class)
public interface CsSendP2pMessageInfoRepository  extends BaseMapper<CsSendP2pMessageInfoPo> {
    @Insert("INSERT INTO CS_SEND_P2P_MESSAGE_INFO  ( " +
            "\"FROM_CS_USER_ID\", " +
            "\"TO_CS_USER_ID\"," +
            " \"CHANNEL\"," +
            " \"CONTENT\"," +
            " \"UQIDENT_NO\"," +
            " \"MSG_CONTENT\", " +
            "    \"MSG_TYPE\"," +
            " \"MSG_TIME\"," +
            " \"STATUS\"," +
            " \"CREATE_TIME\"," +
            " \"UPDATE_TIME\" )" +
            "  VALUES  ( " +
            "#{fromCsUserId}," +
            "#{toCsUserId}," +
            "#{channel}," +
            "          #{content}," +
            "#{uqIdentNo}," +
            "#{msgContent}," +
            "#{msgType}," +
            "#{msgTime}," +
            "#{status}," +
            "#{createTime}," +
            "#{updateTime}" +
            " )")
    int insert1(CsSendP2pMessageInfoPo id);
}
