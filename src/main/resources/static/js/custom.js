    function initCarousel() {
        $('.carousel.carousel-slider').carousel({
            numVisible : 1,
            fullwidth : true,
            indicators : true
        });
        setTimeout(autoplay, 7500);
    }
    function initDropdown() {
        $(".dropdown-trigger").dropdown({
            constrainWidth : false
        });
    }
    function autoplay() {
        $('.carousel.carousel-slider').carousel('next');
        setTimeout(autoplay, 7500);
    }
