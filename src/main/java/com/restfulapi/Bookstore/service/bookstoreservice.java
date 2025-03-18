package com.restfulapi.Bookstore.service;


import com.restfulapi.Bookstore.entity.bookstore;
import com.restfulapi.Bookstore.repository.bookstorerepo;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class bookstoreservice {

    private final bookstorerepo booksrepo;

    public bookstoreservice(bookstorerepo booksrepo) {
        this.booksrepo = booksrepo;
    }

    public bookstore addnewbook(bookstore book) {
        return booksrepo.save(book);
    }

    public List<bookstore> findbookbyprice(int price){
        return booksrepo.findbookaboveprice(price);
    }

    public List<bookstore> findbytitle(String title){
        return booksrepo.findbookfromtitle(title);
    }

    public List<bookstore> getallbooks(){
        return booksrepo.findAll();
    }

    public String deleteifoutofstock(int bookID){
        int count = booksrepo.deletebookoutofstock(bookID);
        if(count == 0){
            return "Book not found";
        }
        else{
            return "Book Deleted Successfully";
        }
    }

    public int updateprice(int bookID, int newprice){
        return booksrepo.updateprice(bookID, newprice);
    }

}
