package com.udem.car2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Declaración de los botones de flechas
    Button up;
    Button down;
    Button rigth;
    Button left;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los botones de flechas
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        rigth = findViewById(R.id.right);
        left = findViewById(R.id.left);

        // Manejador de clic para el botón de flecha hacia arriba
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverCarro("arriba");
            }
        });

        // Manejador de clic para el botón de flecha hacia abajo
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverCarro("abajo");
            }
        });

        // Manejador de clic para el botón de flecha hacia la derecha
        rigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverCarro("derecha");
            }
        });

        // Manejador de clic para el botón de flecha hacia la izquierda
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverCarro("izquierda");
            }
        });

    }

    private void moverCarro(String direccion) {
        switch (direccion) {
            case "arriba":
                moverArriba();
                break;
            case "abajo":
                moverAbajo();
                break;
            case "derecha":
                moverDerecha();
                break;
            case "izquierda":
                moverIzquierda();
                break;
        }
    }

    private void moverIzquierda() {
        // Obtén la referencia al carro en la pantalla
        View carro = findViewById(R.id.left);

        // Obtén la posición actual del carro
        int posX = carro.getLeft();
        int posY = carro.getTop();

        // Calcula la nueva posición
        int nuevaPosX = posX - 10; // Por ejemplo, desplazamiento de 10 píxeles hacia la izquierda
        int nuevaPosY = posY;

        // Establece la nueva posición del carro
        carro.layout(nuevaPosX, nuevaPosY, nuevaPosX + carro.getWidth(), nuevaPosY + carro.getHeight());
    }

    private void moverDerecha() {
        // Obtén la referencia al carro en la pantalla
        View carro = findViewById(R.id.right);

        // Obtén la posición actual del carro
        int posX = carro.getLeft();
        int posY = carro.getTop();

        // Calcula la nueva posición
        int nuevaPosX = posX + 10; // Por ejemplo, desplazamiento de 10 píxeles hacia la derecha
        int nuevaPosY = posY;

        // Establece la nueva posición del carro
        carro.layout(nuevaPosX, nuevaPosY, nuevaPosX + carro.getWidth(), nuevaPosY + carro.getHeight());
    }

    private void moverAbajo() {
        // Obtén la referencia al carro en la pantalla
        View carro = findViewById(R.id.down);

        // Obtén la posición actual del carro
        int posX = carro.getLeft();
        int posY = carro.getTop();

        // Calcula la nueva posición
        int nuevaPosX = posX;
        int nuevaPosY = posY + 10; // Por ejemplo, desplazamiento de 10 píxeles hacia abajo

        // Establece la nueva posición del carro
        carro.layout(nuevaPosX, nuevaPosY, nuevaPosX + carro.getWidth(), nuevaPosY + carro.getHeight());
    }

    private void moverArriba() {
        // Obtén la referencia al carro en la pantalla
        View carro = findViewById(R.id.up);

        // Obtén la posición actual del carro
        int posX = carro.getLeft();
        int posY = carro.getTop();

        // Calcula la nueva posición
        int nuevaPosX = posX;
        int nuevaPosY = posY - 10; // Por ejemplo, desplazamiento de 10 píxeles hacia arriba

        // Establece la nueva posición del carro
        carro.layout(nuevaPosX, nuevaPosY, nuevaPosX + carro.getWidth(), nuevaPosY + carro.getHeight());
    }
}

