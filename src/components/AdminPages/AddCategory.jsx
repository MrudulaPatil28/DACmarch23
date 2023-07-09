import React from 'react';

 export default function AddBook(){
  return(
    <>
    <meta charSet="utf-8" />
    <meta httpEquiv="x-ua-compatible" content="ie=edge" />
    <title>Add Category</title>
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
      <h3>Add Category</h3>
      <div className="card">
        <div className="card-body">
          <div className="col-md-10">
            <form
              action="#"
              th:action="@{/add-category}"
              th:object="${category}"
              method="post"
            >
              <div className="row">
                <div className="form-group col-md-8">
                  <label htmlFor="name" className="col-form-label">
                    Category Name
                  </label>{" "}
                  <input
                    type="text"
                    th:field="*{name}"
                    className="form-control"
                    id="name"
                    placeholder="Category Name"
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