package com.schoolmgmt.school.service;

import com.schoolmgmt.school.entity.Teacher;
import com.schoolmgmt.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
//    public Optional<Teacher> getTeacherByID(Long id) {
//        return teacherRepository.findById(id);
//
//
//    }

    public Optional<Teacher> getTeacherByID(Long id) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        if (optionalTeacher.isPresent()) {
            return Optional.of(optionalTeacher.get());
        } else throw new RuntimeException("The teacher with that ID doesnt exist" + id);


    }

    public Teacher createorupdateTeacher(Teacher teacher) {
        if (teacher.getId() != null) {
            Optional<Teacher> existingTeacher = teacherRepository.findById(teacher.getId());

            if (existingTeacher.isPresent()) {
                //update the teacher info
                Teacher updatedTeacher = existingTeacher.get();
                updatedTeacher.setId(teacher.getId());
                updatedTeacher.setName(teacher.getName());
                updatedTeacher.setEmail(teacher.getEmail());
                return teacherRepository.save(updatedTeacher);
            }
        }


        return teacherRepository.save(teacher);
    }


        public void deleteTeacher (Long id)   {
        Optional <Teacher> teacher=teacherRepository.findById(id);
        if(teacher.isPresent()) {
            Teacher existingTeacher=teacher.get();
            if(existingTeacher.getId() !=null) {
                teacherRepository.deleteById(id);
            }
        } else throw new IllegalArgumentException(STR." Teacher with that that ID doesn't exist\{id}");


    }
}
