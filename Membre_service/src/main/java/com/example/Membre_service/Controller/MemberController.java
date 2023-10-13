package com.example.Membre_service.Controller;




import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;
import com.example.Membre_service.service.IMemberService;
import com.example.Membre_service.service.MemberImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
public class MemberController {
    IMemberService membreService;
    @RequestMapping(value="/membres", method= RequestMethod.GET)
    public List<Membre> findMembres (){
        return membreService.findAll();
    }
    @GetMapping(value="/membres/{id}")
    public Membre findOneMemberById(@PathVariable Long id){
        return membreService.findMember(id);
    }
    @GetMapping(value="/membres/search/cin")
    public Membre findOneMemberByCin(@RequestParam String cin) throws Exception {
        return membreService.findByCin(cin);
    }
    @GetMapping(value="/membres/search/email")
    public Membre findOneMemberByEmail(@RequestParam String email)
    {
        return membreService.findByEmail(email);
    }
    @PostMapping(value="/membres/enseignant")
    public Membre addMembre(@RequestBody EnseignantChercheur m)
    {
        return membreService.addMember(m);
    }
    @PostMapping(value="/membres/etudiant")
    public Membre addMembre(@RequestBody Etudiant e)
    {
        return membreService.addMember(e);
    }
    @DeleteMapping(value="/membres/{id}")
    public void deleteMembre(@PathVariable Long id)
    {

        membreService.deleteMember(id);

    }
    @PutMapping(value="/membres/etudiant/{id}")
    public Membre updatemembre(@PathVariable Long id, @RequestBody
    Etudiant p)
    {

        p.setId(id);
        return membreService.updateMember(p);

    }
    @PutMapping(value="/membres/enseignant/{id}")
    public Membre updateMembre(@PathVariable Long id, @RequestBody
    EnseignantChercheur p)
    {

        p.setId(id);
        return membreService.updateMember(p);

    }
}
