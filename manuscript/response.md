# Reviewer 1

*This is the first paper describing Tracer, the most frequently used software for convergence analysis of phylogenetic MCMC. Thus this paper certainly merits publication, and will no doubt get thousands of citations. Tracer was already very useful, and this new version brings additional useful functionality. The paper is mostly an announcement, and is well written though we have a few comments.*

Thanks

## Regarding the software:

*S1: How does the conditional posterior visualization work? That seems like a major improvement, but it’s not shown anywhere or described beyond a mention in the intro. The documentation basically says “try things out!”-- this mostly works except for here.*

**To do**

*S2: We were happy to see that the HME is no longer an option for model comparison (given its notorious bias).*

No response required

*S3: Box plots and violin plots are a fantastic improvement for viewing multiple distributions at the same time! The >2 dimensional correlation plots are also a welcome addition to the toolkit. *

No response required

*S4: We miss the ability to adjust the number of bins for histograms of univariate marginal distributions.*

**To do:** This feature has been restored [Issue #146](https://github.com/beast-dev/tracer/issues/146).

*S5: Please update the link on http://beast.community/tracer , which currently links to 1.6 (even though it says it’s linking to 1.7)*

Done.

*P1: People mostly use Tracer to diagnose convergence problems. I think the best use of a paper about Tracer would be to walk readers through a side-by-side comparison of two runs, one of which has converged and another that hasn’t. This is additional work, but I think it would be very valuable to guide the community in making such calls. At least, there should be a link in the paper to some material giving such an example. The current Figures 1 b-e and 2a-c feel a little generic-- we know what these plot types look like. *

**To do**

*Title: We cannot resist the temptation to suggest to the more active “Summarizing Bayesian phylogenetic posterior distributions using Tracer 1.7”*

*L68: the BSSVS description doesn’t really feel like it comes to a satisfactory conclusion. Can you more clearly describe how Tracer helps with this type of analysis? Is the sentence at line 80 a continuation of this thought, or starting something new?*

*L197: the proper citation is “...finds its rootS”*

Fixed.

*Fig 1a: the parameter name being open for editing is distracting*

*L108: I am not sure I understand the comparison (“model complexity”) being made between the marginal and joint marginal plots. If it is just the number of nonzero parameters, it could be stated more clearly.*

*L130: coda also offers diagnostics absent from Tracer, such as Gelman-Rubin statistics.*

*Please cite RWTY https://academic.oup.com/mbe/article/34/4/1016/2900564 , which has some features (e.g. topology diagnostics) that are not present in Tracer.*

Done.

*Figure 3 has no axis labels of any kind*

# Reviewer 2

*Line 36: Are there any references or reasons you can provide why should use cut-off values of 100 and 200? Or are these arbitrary?*

*Line 43: If I'm correct, then the file names don't need to be same but the parameter name. Could you please correct this.*

*Line 82-86: I was wondering if the demographic plotting are truly restricted to these models? There seem to be several more options available specifically for the "Demographic Reconstruction". *

### Feature suggestions (these are rather general and not necessary for the manuscript):

*1) It would be nice to export a csv file with the parameter estimates (mean, 95% HPD,  etc) and ESS values so that this can be used easier in reports.*

This has been implemented already under the File menu -> Export Data Table. ** This needs to be tested ***

*2) There seems to be some memory issue in Tracer when multiple large files are opened. Closing and opening gets around the issue. It would be nice if that is fixed in some future release.*

**Test loading a too large file.**

# Editor's comments

*Almost all of the material is clear and understandable, even to readers who have never used the software. For me the exception was the paragraph starting at 66. Since this appears to be a new feature, it probably could be elaborated on. Some general description of the types of things that can be conditioned on (models, the presence of variables in models, ...) and how the software does this, possibly with a figure, might help before or with some of the specifics on lines 68-79; I didn't actually see much about this in briefly looking at the tutorials on beast.community/tracer.*

*-Fig 1(b)-(d): If you want to make space for additions, two of these could be cut and simply described as a list of (very familiar) available graphics for comparing multiple (marginal) distributions. By contrast, Fig 2(b)-(d) are less familiar and really need a figure to accompany the text description.*

*-l67: Something like the sentence starting on l71 could be moved here to indicate generally how the conditional distributions are constructed from the sampled parameter values. It would be valuable to say something about how generally the indicator functions can be defined, how they are selected...*

*-l79: `Finally,...' Should this be a new paragraph?*
