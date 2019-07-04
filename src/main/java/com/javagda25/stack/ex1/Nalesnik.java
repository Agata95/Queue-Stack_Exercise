package com.javagda25.stack.ex1;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data

public class Nalesnik {
    private List<String> listaSkladnikow;
    private LocalDateTime czasStworzenia = LocalDateTime.now();

    public Nalesnik(List<String> listaSkladnikow) {
        this.listaSkladnikow = listaSkladnikow;
    }
}
