import React from 'react';

 export default function UpdateBook(){
  return(
    <>
    <meta charSet="utf-8" />
    <meta httpEquiv="x-ua-compatible" content="ie=edge" />
    <title>Update Book</title>
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
    <div className="container my-5">
      <h3>Update Book</h3>
      <div className="card">
        <div className="card-body">
          <div className="col-md-10">
            <form
              action="#"
              th:action="@{/update-book/{id}(id=${book.id})}"
              th:object="${book}"
              method="post"
            >
              <div className="row">
                <div className="form-group col-md-8">
                  <label htmlFor="isbn" className="col-form-label">
                    ISBN
                  </label>{" "}
                  <input
                    type="text"
                    th:field="*{isbn}"
                    className="form-control"
                    id="isbn"
                    placeholder="ISBN"
                  />{" "}
                  <span
                    th:if="${#fields.hasErrors('isbn')}"
                    th:errors="*{isbn}"
                  />
                </div>
                <div className="form-group col-md-8">
                  <label htmlFor="name" className="col-form-label">
                    Book Name
                  </label>{" "}
                  <input
                    type="text"
                    th:field="*{name}"
                    className="form-control"
                    id="name"
                    placeholder="Book Name"
                  />
                </div>
                <div className="form-group col-md-8">
                  <label htmlFor="serialName" className="col-form-label">
                    Serial Name{" "}
                  </label>{" "}
                  <input
                    type="text"
                    th:field="*{serialName}"
                    className="form-control"
                    id="serialName"
                    placeholder="Serial Name"
                  />
                </div>
                <div className="form-group col-md-8">
                  <label htmlFor="description" className="col-form-label">
                    Description
                  </label>
                  <input
                    type="text"
                    th:field="*{description}"
                    className="form-control"
                    id="description"
                    placeholder="Description"
                  />
                </div>
                <div className="col-md-6">
                  <input
                    type="submit"
                    className="btn btn-success"
                    defaultValue=" Submit "
                  />
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <div th:insert="comman/footer :: footer" />
  </>
  
  )
 }