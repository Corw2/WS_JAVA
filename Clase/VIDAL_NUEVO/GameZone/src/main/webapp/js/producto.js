document.addEventListener('DOMContentLoaded', function() {
    
    // Obtener el ID del producto de alguna manera, por ejemplo, de un atributo en el cuerpo de la página
    var productId = 1; //document.body.getAttribute('id');

    // Crear una nueva solicitud AJAX
    var xhr = new XMLHttpRequest();

    // Configurar la solicitud AJAX
	// xhr.open('POST', '../CargarProductoServlet', true);    
    xhr.open('POST', 'CargarProductoServlet', true);    
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // Configurar la función de devolución de llamada cuando la solicitud esté completa
    xhr.onreadystatechange = function() {
		
		if (xhr.readyState === XMLHttpRequest.LOADING) {
		    var urlBase = window.location.origin;
		    //alert("URL base: " + urlBase + "/GameZone/");
			
			var baseElement = document.querySelector("base");
			if (baseElement) {
			    baseElement.setAttribute("href", urlBase + "/GameZone/");
			} else {
			    baseElement = document.createElement("base");
			    baseElement.setAttribute("href", urlBase);
			    document.head.appendChild(baseElement);
			}	
		}
		
        if (xhr.readyState == XMLHttpRequest.DONE) {
            if (xhr.status == 200) {
	            // La solicitud fue exitosa, manejar la respuesta del servlet
	            var data = JSON.parse(xhr.responseText);
	            // Hacer algo con los datos recibidos, por ejemplo, mostrarlos en la página
	            mostrarDatos(data);
	        } else {
	            // La solicitud falló
	            console.error('Error al realizar la solicitud: ' + xhr.status);
	        }
        }
    };

    // Enviar la solicitud
    xhr.send('id_producto=' + productId);
});

function mostrarDatos(data) {

	document.getElementById('valoracion').textContent = data.valoracion;
    document.getElementById('nombre').textContent = data.nombre;
    document.getElementById('precio').textContent = '€' + data.precio;
    document.getElementById('imagenPrincipal').src = data.ruta_imagen;
    
}

function openModal(img) {
    var modal = document.getElementById("myModal");
    modal.style.display = "block";

    // Construir la imagen en el modal
    var modalContent = document.getElementById("modalContent");
    modalContent.innerHTML = "<img class='modal-img' src='" + img + "' alt=''>";

    // Establecer el índice inicial
    modalIndex = Array.from(document.querySelectorAll('.capturas img')).findIndex(element => element.src === img);

    // Mostrar la imagen correspondiente al índice inicial
    showSlides(modalIndex);
}

function plusSlides(n) {
    showSlides(modalIndex += n);
}

function showSlides(n) {
    var slides = document.querySelectorAll('.capturas img');
    if (n >= slides.length) {
        modalIndex = 0;
    }
    if (n < 0) {
        modalIndex = slides.length - 1;
    }
    openModal(slides[modalIndex].src);
}

function closeModal() {
    document.getElementById("myModal").style.display = "none";
}