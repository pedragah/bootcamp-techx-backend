package com.example.techxbackend.service;

import com.example.techxbackend.model.Tarefa;
import com.example.techxbackend.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa createTarefa(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void deleteTarefa(Long id){
        tarefaRepository.deleteById(id);
    }
}
