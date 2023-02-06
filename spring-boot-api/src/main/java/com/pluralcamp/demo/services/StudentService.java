package com.pluralcamp.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralcamp.demo.exceptions.ResourceNotFoundException;
import com.pluralcamp.demo.model.Student;
import com.pluralcamp.demo.repositories.StudentRepository;

@Service
public class StudentService {

	//Creacion de objetos la hace spring por el IOC.
		@Autowired
		private StudentRepository studentRepository;
		
	
		
		public List<Student> getStudents(){
			return studentRepository.findAll();
			
		}
		public List<Student> getStudentsByName(String name){
			return studentRepository.findByName(name);
		}
		public Student getStudentById(int id) throws ResourceNotFoundException{
			Optional<Student> student = studentRepository.findById(id);
			if(!student.isPresent()) {
				throw new ResourceNotFoundException("El recurso no se ha encontrado!");
			}
			return student.get();
		}
		public List<Student> getStudentsByNameAndSurname(String name, String surname){
			return studentRepository.findByNameAndSurname(name, surname);
		}
		public List<Student> getStudentsByAge(int age){
			return studentRepository.findByAge(age);
		}
		
		//Para guardar:
		// @param student;
		// @return el objeto Student guardado en la bbdd
		public Student saveStudent(Student student) {
			return studentRepository.save(student);
		}
		
		//UPDATE
		public Student updateStudent(Student student) throws ResourceNotFoundException{
			Optional<Student> oldStudent = studentRepository.findById(student.getIdstudent());
			if(!oldStudent.isPresent()) {
				throw new ResourceNotFoundException("El recurso no se ha encontrado!");
			}else {
				Student studentToUpdate = oldStudent.get();
				studentToUpdate.setName(student.getName());
				studentToUpdate.setSurname(student.getSurname());
				studentToUpdate.setAge(student.getAge());
				Student updatedStudent = studentRepository.save(studentToUpdate);
				return updatedStudent;
			}
		}
}
