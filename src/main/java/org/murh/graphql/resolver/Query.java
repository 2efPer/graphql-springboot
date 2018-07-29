package org.murh.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.murh.graphql.model.Author;
import org.murh.graphql.model.Book;
import org.murh.graphql.repo.AuthorRepository;
import org.murh.graphql.repo.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
