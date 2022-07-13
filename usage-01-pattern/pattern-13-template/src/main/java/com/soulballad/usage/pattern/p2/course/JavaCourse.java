package com.soulballad.usage.pattern.p2.course;

public class JavaCourse extends AbstractCourse {
    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }
}
