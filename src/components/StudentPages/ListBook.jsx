import React from 'react';

 export default function AddBook(){
  return(
    <>
  <meta charSet="UTF-8" />
  <meta httpEquiv="x-ua-compatible" content="ie=edge" />
  <title>All Books</title>
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link
    rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
  />
  <link
    rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
  />
  <div th:insert="comman/header :: header" />
  <div className="container my-2">
    <div className="card">
      <div className="card-body">
        <div className="container my-5">
          <div className="col-md-12">
            <div>
              <table className="table table-striped table-responsive-md">
                <thead>
                  <tr>
                    <th>ISBN</th>
                    <th>Category Name</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Publisher Name</th>
                    <th>Serial Name</th>
                    <th>Borrow</th>

                    <td>
                    <a
                      th:href="@{/borrow/{id}(id=${book.id})}"
                      className="btn btn-warning"
                    >
                      <i class="fa-solid fa-book" style="color: #ed0249;"></i>
                    </a>
                  </td>

                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td th:text="${book.isbn}" />
                    <td th:text="${book.categories[0].name}" />
                    <td th:text="${book.name}" />
                    <td th:text="${book.authors[0].name}" />
                    <td th:text="${book.publishers[0].name}" />
                    <td th:text="${book.serialName}" />
                    <td th:text="${book.description}" />
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div th:insert="comman/footer :: footer" />
</>

  )
}