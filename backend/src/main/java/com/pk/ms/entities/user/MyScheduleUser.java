package com.pk.ms.entities.user;

import com.pk.ms.entities.schedule.Schedule;

import javax.persistence.*;

@Entity
public class MyScheduleUser {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myscheduleuser_seq")
    @SequenceGenerator(name = "myscheduleuser_seq", sequenceName = "myscheduleuser_seq", allocationSize = 1)
    private long userId;

    private String firstName;

    private String lastName;

    private String nick;

    private String email;

    @OneToOne(mappedBy = "user")
    private Schedule schedule;
    public MyScheduleUser() {

    }

    public MyScheduleUser(String firstName, String lastName, String nick, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
