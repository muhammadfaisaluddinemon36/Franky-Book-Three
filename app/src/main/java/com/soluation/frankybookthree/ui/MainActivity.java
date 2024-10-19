package com.soluation.frankybookthree.ui;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import static com.soluation.frankybookthree.utils.Constant.BOOK;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.soluation.frankybookthree.R;
import com.soluation.frankybookthree.model.Book;
import com.soluation.frankybookthree.utils.BaseActivity;
import com.soluation.frankybookthree.utils.BookAdapter;
import com.soluation.frankybookthree.utils.Constant;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private ArrayList<Book> bookList;
    private MaterialToolbar materialToolbar;
//    private Book book;
  private BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        bookList = new ArrayList<>();

        bookList.add(new Book("https://drive.google.com/file/d/1wPPmbfifQocmjUPvNu0q4cbZyGXrxxci/view?usp=sharing","https://images.template.net/717/Free-Fantasy-Book-Cover-Template-2x.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1m-sexAJZ6iEwgOKEveVBXbMKlR3cif3x/view?usp=share_link","https://m.media-amazon.com/images/I/61tl1JgLisL._AC_UF1000,1000_QL80_.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1PeeEd9weQ-4R_2tKvGeDBGSMOWEemAkd/view?usp=share_link","https://www.creativeparamita.com/wp-content/uploads/2022/10/tree-of-wishes-442x705.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/12_o-hN94zdfHkNtpUc_UC9sUWZV4fWRs/view?usp=share_link","https://www.creativeparamita.com/wp-content/uploads/2023/02/Echoes-of-the-Mind.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1CsytcXZgwYWs9I1COMu2jloUJNrQ0y0P/view?usp=share_link","https://thebookcoverdesigner.com/wp-content/uploads/2017/05/under-the-tree-scaled.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1QanUlfr6Ekxc_zBr0KvoNTbct6erh7HX/view?usp=sharing","https://m.media-amazon.com/images/I/71UW+3D8KSL._AC_UF1000,1000_QL80_.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1MdUArkQbv6bdBVnNIxuVQVLakB5dXxSv/view?usp=share_link","https://visme.co/blog/wp-content/uploads/2021/06/inspirational-book-cover-template-visme.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1mgsFLsWi9w3qNzj7LZ55YvpAVtXnoNzD/view?usp=sharing","https://marketplace.canva.com/EAFPpkFj4is/1/0/1003w/canva-black-romance-novel-book-cover-7clVjOZ2o_Y.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1MdUArkQbv6bdBVnNIxuVQVLakB5dXxSv/view?usp=sharing","https://marketplace.canva.com/EAFtMYVrRvE/1/0/501w/canva-pink-and-black-simple-romance-book-cover-bKbt_BGdATE.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1mgsFLsWi9w3qNzj7LZ55YvpAVtXnoNzD/view?usp=sharing","https://images.template.net/252/Free-Non-fiction-Book-Cover-Template-2x.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1H26Ow8ZGK9MooX3eE6___QSv_-G6uu6p/view?usp=sharing","https://covers.bookcoverzone.com/slir/w450/png24-front/bookcover0000338.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1KqCmuuDJ5z0hbly22CbCNdrypwdiOkhi/view?usp=sharing","https://covers.bookcoverzone.com/slir/w450/png24-front/bookcover0009601.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/19Xm_8lWGkAQAlwG7-C995hhMmXuhBZ1B/view?usp=sharing","https://marketplace.canva.com/EAFL1H1RNi4/1/0/1003w/canva-pastel-minimal-trendy-photo-person-on-the-nature-book-cover-K0nOB45FQhE.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1pPa8MAe7c3sljctt49idVdBjDXTdei2q/view?usp=sharing","https://www.creativeparamita.com/wp-content/uploads/2022/09/journey-begins.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/11DaZ970QUDkAiRvFNtOWF8GGoX684ysG/view?usp=sharing","https://bookcoverssl.com/wp-content/uploads/2024/02/Awaken-Your-Best-Self-800x1280.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/14xEeuZNjJ64LCwH0ISLIf1GYBpLm2NVx/view?usp=sharing","https://beetifulbookcovers.com/wp-content/uploads/2016/01/LeapForSuccess.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1qfmngPrMdEmpJCuueS-GPo7la9IJs01S/view?usp=sharing","https://bookcoverssl.com/wp-content/uploads/2024/02/Step-by-Step-Success.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1BhhKiDhRxa35CfEFPRD95aCdzytWP_rW/view?usp=sharing","https://www.books-design.com/wp-content/uploads/2022/09/Olivia-Hayle-say-yes-to-the-boss.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/114zFhJCxhGmg-kLqdWUEXKsLQtRdb73x/view?usp=sharing","https://covers.bookcoverzone.com/slir/w450/png24-front/bookcover0000170.jpg"));
        bookList.add(new Book("https://drive.google.com/file/d/1c3XlU-t-WpN_JBUUi9X62HVJ6bDvsOje/view?usp=sharing","https://covers.bookcoverzone.com/slir/w450/png24-front/bookcover0001080.jpg"));

        adapter = new BookAdapter(bookList, new BookAdapter.OnBookClickListener() {
            @Override
            public void onItemClick(Book book) {
                if (book.getPdfUrl() != null) {
                    Intent intent = new Intent(MainActivity.this, InAppBrowser.class);
                    intent.putExtra(BOOK , book);
                    startActivity(intent);
                }
            }
        });
        setupToolbar(R.id.materialToolbar);
        recyclerView.setAdapter(adapter);
                }
            }

