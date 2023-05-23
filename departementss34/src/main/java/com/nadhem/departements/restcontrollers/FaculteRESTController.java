package com.nadhem.departements.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nadhem.departements.entities.Faculte;
import com.nadhem.departements.repos.FaculteRepository;
@RestController
@RequestMapping("/api/fac")
@CrossOrigin("*")
public class FaculteRESTController {
@Autowired
FaculteRepository faculteRepository;
@RequestMapping(method=RequestMethod.GET)
public List<Faculte> getAllFacultes()
{
return faculteRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Faculte getFaculteById(@PathVariable("id") Long id) {
return faculteRepository.findById(id).get();
}
}

