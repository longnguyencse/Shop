(function( $ ) {
/**
 * START - ONLOAD - JS
 */
/* ----------------------------------------------- */
/* ------------- FrontEnd Functions -------------- */
/* ----------------------------------------------- */
function fixHheader () {
    if (!$('.top-header-bar').length) { return; }

    $('.top-header-bar').css('height', $('.top-header-bar').outerHeight());
}



/* ----------------------------------------------- */
/* ----------------------------------------------- */
/* OnLoad Page */
$(document).ready(function($){
    fixHheader ();
});
/* OnLoad Window */
var init = function () {

};
window.onload = init;

})(jQuery);
