package com.soulballad.usage.p2.course;

public interface ICourseAggregate {
    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
