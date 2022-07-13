package com.soulballad.usage.pattern.p2.course;

public interface ICourseAggregate {
    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
