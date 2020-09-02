package com.soulballad.usage.p2.chain;

public class CourseBuilder {
    private final Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPPT(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return this.course;
    }

    public static class Course {

        private String name;
        private String ppt;
        private String video;
        private String note;

        private String homework;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPpt() {
            return ppt;
        }

        public void setPpt(String ppt) {
            this.ppt = ppt;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getHomework() {
            return homework;
        }

        public void setHomework(String homework) {
            this.homework = homework;
        }

        @Override
        public String toString() {
            return "CourseBuilder{" + "name='" + name + '\'' + ", ppt='" + ppt + '\'' + ", video='" + video + '\''
                + ", note='" + note + '\'' + ", homework='" + homework + '\'' + '}';
        }
    }

}
