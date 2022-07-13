package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.demo.transparent.Course;
import com.soulballad.usage.pattern.p2.demo.transparent.CourseComponent;
import com.soulballad.usage.pattern.p2.demo.transparent.CoursePackage;
import org.junit.Test;

public class CourseTest {

    @Test
    public void test_course() {
        System.out.println("============透明组合模式===========");

        CourseComponent javaBase = new Course("Java入门课程", 8280);
        CourseComponent ai = new Course("人工智能", 5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("Java设计模式", 1500);
        CourseComponent source = new Course("源码分析", 2000);
        CourseComponent softSkill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catalog = new CoursePackage("课程主目录", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();
    }
}
