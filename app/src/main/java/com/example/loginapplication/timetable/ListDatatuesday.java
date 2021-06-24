package com.example.loginapplication.timetable;

public class ListDatatuesday {


        private String hall;
        private String staff;
        private String subname;
        private String time;


        public ListDatatuesday(){


        }

        public ListDatatuesday(String hall, String staff, String subname, String time) {
            this.hall = hall;
            this.staff = staff;
            this.subname=subname;
            this.time=time;

        }

    public String getHall() {
        return hall;
    }

    public String getStaff() {
        return staff;
    }

    public String getSubname() {
        return subname;
    }

    public String getTime() {
        return time;
    }
}

