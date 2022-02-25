var $target = document.querySelector('.target')
var $button = document.querySelector('.button')
$button.addEventListener('click', function() {
  $target.classList.toggle('is-hidden')
})