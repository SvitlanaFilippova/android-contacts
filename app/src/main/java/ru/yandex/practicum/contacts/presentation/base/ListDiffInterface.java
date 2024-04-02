package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<T> {

    boolean theSameAs(@NonNull T t);


    boolean equals(Object t);
}
