package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.course.Course;
import com.soulballad.usage.pattern.p2.course.CourseAggregateImpl;
import com.soulballad.usage.pattern.p2.course.ICourseAggregate;
import com.soulballad.usage.pattern.p2.course.Iterator;
import org.junit.Test;

public class CourseIteratorTest {

    @Test
    public void test_courseIterator() {
        Course java = new Course("Java架构");
        Course javaBase = new Course("Java基础");
        Course design = new Course("设计模式");
        Course ai = new Course("人工智能");

        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(javaBase);
        aggregate.add(design);
        aggregate.add(ai);

        System.out.println("===========课程列表==========");
        printCourse(aggregate);

        aggregate.remove(ai);

        System.out.println("===========删除操作之后的课程列表==========");
        printCourse(aggregate);
    }

    private void printCourse(ICourseAggregate aggregate) {
        Iterator<Course> i = aggregate.iterator();
        while (i.hasNext()) {
            Course course = i.next();
            System.out.println("《" + course.getName() + "》");
        }
    }
}
