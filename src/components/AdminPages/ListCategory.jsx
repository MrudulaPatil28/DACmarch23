import React from 'react';

 export default function AddBook(){
  return(
    <>
    <meta charSet="UTF-8" />
    <meta httpEquiv="x-ua-compatible" content="ie=edge" />
    <title>All Categories</title>
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
      <div th:switch="${categories}" className="container my-5">
        <p className="my-5">
          <a href="/addCategory" className="btn btn-dark">
            {" "}
            <i className="fas fa-user-plus ml-2"> Add Category </i>
          </a>
          &nbsp;&nbsp;
          <a href="/export/all-category" className="btn btn-info">
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
                  <th>Category Name</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
              </thead>
              <tbody>
                <tr th:each="category : ${categories}">
                  <td th:text="${category.name}" />
                  <td>
                    <a
                      th:href="@{/updateCategory/{id}(id=${category.id})}"
                      className="btn btn-warning"
                    >
                      <i className="fas fa-user-edit ml-2" />
                    </a>
                  </td>
                  <td>
                    <a
                      th:href="@{/remove-category/{id}(id=${category.id})}"
                      className="btn btn-danger"
                    >
                      <i className="fas fa-user-times ml-2" />
                    </a>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
    <div th:insert="comman/footer :: footer" />
  </>
  
  )
}