package co.bergamota.controllers;

import co.bergamota.business.objects.Pesquisador;
import co.bergamota.business.objects.Usuario;
import co.bergamota.dataaccess.PesquisadorRepository;
import co.bergamota.dataaccess.UsuarioRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PesquisadorRepository pesquisadorRepository;

    @RequestMapping("/usuarios/getAll")
    public ArrayList<Usuario> getUsuarios() {
        return Lists.newArrayList(usuarioRepository.findAll());
    }

    @RequestMapping("/pesquisadores/getAll")
    public ArrayList<Pesquisador> getPesquisadores() {
        return Lists.newArrayList(pesquisadorRepository.findAll());
    }

}