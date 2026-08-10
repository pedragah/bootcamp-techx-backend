package com.example.techxbackend.controller;


import com.example.techxbackend.model.Tarefa;
import com.example.techxbackend.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tarefa")
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class TarefaController {
    private final TarefaService tarefaService;

    @GetMapping("/tarefas")
    public List<Tarefa> getAllTarefas(){
        return tarefaService.getAllTarefas();
    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.createTarefa(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deleteTarefa(@PathVariable Long id){
        tarefaService.deleteTarefa(id);
    }

}
