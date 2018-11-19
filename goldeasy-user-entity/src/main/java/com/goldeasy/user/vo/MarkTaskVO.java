package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: adminisrator
 * @date: 2018/11/19
 * @description:
 */
public class MarkTaskVO implements Serializable {
    /**
     * 积分任务图标
     */
    private String iconPath;
    /**
     * 积分任务标题
     */
    private String taskTitle;
    /**
     * 积分任务描述
     */
    private String taskDes;
    /**
     * 积分任务，获取的积分数量
     */
    private String markAmount;

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDes() {
        return taskDes;
    }

    public void setTaskDes(String taskDes) {
        this.taskDes = taskDes;
    }

    public String getMarkAmount() {
        return markAmount;
    }

    public void setMarkAmount(String markAmount) {
        this.markAmount = markAmount;
    }

    @Override
    public String toString() {
        return "MarkTaskVO{" +
                "iconPath='" + iconPath + '\'' +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskDes='" + taskDes + '\'' +
                ", markAmount='" + markAmount + '\'' +
                '}';
    }
}
