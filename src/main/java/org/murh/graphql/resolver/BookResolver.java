package org.murh.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.murh.graphql.model.Author;
import org.murh.graphql.model.Book;
import org.murh.graphql.repo.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
