function checkPassword(form) {
   // naming convention for an element: formId:elementName
   var password = form[form.id + ":password"].value;
   var passwordConfirm = form[form.id + ":confirmPwd"].value;

   if(password == passwordConfirm)
      form.submit();
   else
      alert("Password and password confirm fields don't match");
}
