package xyz.sy007.demomp.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;

/**
 * @description: 用来对应数据表 CS_SEND_P2P_MESSAGE_INFO，在插入数据时使用
 * @author: wangning
 * @create: 2023/12/19 20:24
 **/
@Data
@TableName("CS_SEND_P2P_MESSAGE_INFO")
public class CsSendP2pMessageInfoPo {

    public CsSendP2pMessageInfoPo() {
    }
    public static final int STATUS_CREATE = 0; //新建

    public static final int STATUS_SUCCESS = 1; //发送成功

    public static final int STATUS_WITHDRAW = 2; //已撤销

    public static final int STATUS_FAIL = 99; //发送失败

    public static final int TYPE_MSG = 0; //消息类型

    public static final int TYPE_FILE = 1; //文件类型

    @TableId(value = "\"ID\"", type = IdType.AUTO)
    private Long id;

    @TableField(value = "\"FROM_CS_USER_ID\"")
    private String fromCsUserId;

    @TableField(value = "\"TO_CS_USER_ID\"")
    private String toCsUserId;

    @TableField(value = "\"CHANNEL\"")
    private String channel;

    @TableField(value = "\"CONTENT\"")
    private String content;

    @TableField(value = "\"UQIDENT_NO\"")
    private String uqIdentNo;

    @TableField(value = "\"MSG_CONTENT\"")
    private String msgContent;

    @TableField(value = "\"FILE_NAME\"")
    private String fileName;

    @TableField(value="\"FILE_URL\"")
    private String fileUrl;

    @TableField(value = "\"MSG_TYPE\"")
    private Integer msgType;

    @TableField(value = "\"MSG_TIME\"")
    private Long msgTime;

    @TableField(value = "\"STATUS\"")
    private Integer status;

    @TableField(value = "\"CREATE_TIME\"")
    private Date createTime = new Date(); //创建时间

    @TableField(value = "\"UPDATE_TIME\"")
    private Date updateTime = new Date(); //修改时间

}
