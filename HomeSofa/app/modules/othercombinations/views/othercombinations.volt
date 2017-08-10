{% if test2 is not defined %}
    <div>
        OtherCombinations Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        OtherCombinations 2 Function called: {{ function }}
    </div>
{% endif %}
