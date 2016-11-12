package com.scrdl;

import com.scrdl.Course;
import com.scrdl.CourseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestCourseLoader implements ApplicationListener<ContextRefreshedEvent> {

    private CourseRepository courseRepository;

    private Logger log = Logger.getLogger(TestCourseLoader.class);

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Course harvardFrench1 = new Course();
        harvardFrench1.setSchool("Harvard");
        harvardFrench1.setName("Intro to French");
        harvardFrench1.setCode("1");
        harvardFrench1.setTaughtBy("Bob Smith");
        harvardFrench1.setWorkload(10);
        courseRepository.save(harvardFrench1);

        log.info("Saved Harvard Intro to French");

        Course wisconsinPhysics365 = new Course();
        wisconsinPhysics365.setSchool("UW-Madison");
        wisconsinPhysics365.setName("Quantum Physics");
        wisconsinPhysics365.setCode("365");
        wisconsinPhysics365.setTaughtBy("Lorraine Adams");
        harvardFrench1.setWorkload(20);
        courseRepository.save(wisconsinPhysics365);


        log.info("Saved Wisconsin Quantum Physics");

        Course calCS200 = new Course();
        calCS200.setSchool("University of California");
        calCS200.setName("Computer Architecture");
        calCS200.setCode("200");
        calCS200.setTaughtBy("Juan Rodriguez");
        calCS200.setWorkload(16);
        courseRepository.save(calCS200);


        log.info("Saved Cal Computer Architecture");
    }

}
