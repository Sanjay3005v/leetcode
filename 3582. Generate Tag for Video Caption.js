//3582. Generate Tag for Video Caption


/**
 * @param {string} caption
 * @return {string}
 */
var generateTag = function (caption) {
    if (caption.trim() === '') {
        return '#';
    }

    let words = caption.trim().split(/\s+/);
    let sol = '#' + words[0].toLowerCase();

    for (let i = 1; i < words.length; i++) {
        sol += words[i].charAt(0).toUpperCase() + words[i].substring(1).toLowerCase();
    }

    if (sol.length > 100) {
        return sol.substring(0, 100);
    }

    return sol;
};
