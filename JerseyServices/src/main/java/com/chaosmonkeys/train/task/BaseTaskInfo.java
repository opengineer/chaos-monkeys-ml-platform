package com.chaosmonkeys.train.task;

import com.chaosmonkeys.Utilities.StringUtils;

import java.io.File;

/**
 * Base task information class
 * training or predication task should inherit this class
 * to specify the basic information of a task
 *
 * Jiawei Li
 */

public class BaseTaskInfo {

    /** Identifier for a task **/
    public final String TASK_ID;

    public final TaskType taskType;

    /**
     * Make sure subclass invoke this super() constructor
     */
    public BaseTaskInfo(TaskType type){
        this.TASK_ID = StringUtils.getUUID();
        this.taskType = type;
    }

    public BaseTaskInfo(TaskType type, ResourceInfo resInfo){
        this(type); // assign an UUID as identifier
    }


    /**
     * Obtain the identifier of the task
     * @return
     */
    public String getTaskId(){
        return this.TASK_ID;
    }

}
