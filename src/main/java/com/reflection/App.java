package com.reflection;

import com.reflection.models.*;
import com.reflection.annotation.*;

public final class App {

    public static void main(String[] args) {

        Cat cat = new Cat(0);
        CatUnit.invokeTestMethods(cat);

    }

}
