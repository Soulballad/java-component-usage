package com.soulballad.usage.p2.course;

import org.junit.Test;

/**
 *
 */
public class CourseTemplateTest {

    @Test
    public void test_course() {
        System.out.println("=========架构师课程=========");
        JavaCourse java = new JavaCourse();
        java.setNeedCheckHomework(false);
        java.createCourse();

        System.out.println("=========Python课程=========");
        PythonCourse python = new PythonCourse();
        python.createCourse();
    }
}
