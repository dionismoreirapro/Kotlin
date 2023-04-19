package com.mercadolivro.service

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.enums.Errors
import com.mercadolivro.extension.NotFoundException
import com.mercadolivro.model.BookModel
import com.mercadolivro.repository.BookRepository
import org.springframework.stereotype.Service
import kotlin.math.log

@Service
class BookService(var bookRepository: BookRepository) {

    fun create(book: BookModel) {
        bookRepository.save(book)

    }

    fun findAll(): List<BookModel>{
        return bookRepository.findAll().toList()
    }

    fun findActives(): List<BookModel> {
        return  bookRepository.findByStatus(BookStatus.ATIVO)

    }

    fun findById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow {
            NotFoundException(
                Errors.ML001.message.format(id),
                Errors.ML001.code
            )
        }
    }

    fun delete(id: Int) {
        // Não será apagado somente alterado o status
        val book = findById(id)
        book.status = BookStatus.CANCELADO
        bookRepository.save(book)



    }
}
