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
      <div th:switch="${books}" className="container my-5">
        <p className="my-5">
          <a href="/add" className="btn btn-dark">
            {" "}
            <i className="fas fa-user-plus ml-2"> Add Book </i>
          </a>
          &nbsp;&nbsp;
          <a href="/export/all-book" className="btn btn-info">
            {" "}
            <i className="fas fa-file-csv ml-2"> Export CSV </i>
          </a>
        </p>
        <div className="col-md-12">
          <h2 th:case="null">No record found !!</h2>
          <div th:case="*">
            <table className="table table-bordered">
              <thead>
                <tr>
                  <th>ISBN</th>
                  <th>Book Name</th>
                  <th>Description</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
              </thead>
              <tbody>
                <tr th:each="book : ${books}">
                  <td th:text="${book.isbn}" />
                  <td th:text="${book.name}" />
                  <td th:text="${book.description}" />
                
                  <td>
                    <a
                      th:href="@{/update/{id}(id=${book.id})}"
                      className="btn btn-warning"
                    >
                      <i className="fas fa-user-edit ml-2" />
                    </a>
                  </td>
                  <td>
                    <a
                      th:href="@{/remove-book/{id}(id=${book.id})}"
                      className="btn btn-danger"
                    >
                      <i className="fas fa-user-times ml-2" />
                    </a>
                  </td>
                </tr>
              </tbody>
            </table>
            <div
              th:if="${books.totalPages > 0}"
              className="pagination"
              th:each="pageNumber : ${pageNumbers}"
            >
              <a
                th:href="@{/books(size=${books.size}, page=${pageNumber})}"
                th:text="${pageNumber}"
                th:class="${pageNumber==books.number + 1} ? active"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
    <div th:insert="comman/footer :: footer" />
  </>
  
  )
}