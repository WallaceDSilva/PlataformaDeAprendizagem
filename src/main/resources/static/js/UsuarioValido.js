
$(document).ready(function () {
    $("#formulario").submit(function (event) {
        const emailInput = $("#email");
        if (!validarEmail(emailInput.val())) {
            event.preventDefault(); 
            alert("Por favor, insira um e-mail válido.");
        }
    });

    function validarEmail(email) {
        return /\S+@\S+\.\S+/.test(email);
    }
});


