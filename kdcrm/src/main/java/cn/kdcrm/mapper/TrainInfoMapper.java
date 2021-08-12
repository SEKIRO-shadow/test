package cn.kdcrm.mapper;

import cn.kdcrm.pojo.TrainInfo;
import java.math.BigDecimal;
import java.util.List;

public interface TrainInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAIN_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal trainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAIN_INFO
     *
     * @mbggenerated
     */
    int insert(TrainInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAIN_INFO
     *
     * @mbggenerated
     */
    TrainInfo selectByPrimaryKey(BigDecimal trainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAIN_INFO
     *
     * @mbggenerated
     */
    List<TrainInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAIN_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TrainInfo record);
}